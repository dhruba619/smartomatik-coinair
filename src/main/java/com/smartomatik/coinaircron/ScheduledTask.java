package com.smartomatik.coinaircron;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Component
public class ScheduledTask {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

	@Value("${coincube.api.key}")
	private String coinCubeApiKey;

	@Value("${coincube.api.secret}")
	private String coinCubeApiSecret;

	@Value("${coincube.api.url}")
	private String coinCubeApiUrl;
	
	@Value("${airtable.api.key}")
	private String airTableApiKey;
	
	@Value("${airtable.api.url}")
	private String airtableUrl;

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM:DD:YYYY'T'HH:mm:ss.XXX");

	@Scheduled(cron = "${app.cron.schedule}")
	public void executeTask() {
		
		CoinCubeSummary summary = fetchCoinCubeSummary();
		postToAirtable(new CoinCubeToAirTableMapper().apply(summary.getBalances()));
	}

	/**
	 * Method to fetch balance details from coincube.
	 * 
	 * @return
	 */
	private CoinCubeSummary fetchCoinCubeSummary() {
		log.info("Fetching summary at {} ", dateFormat.format(new Date()));
		HttpHeaders headers = new HttpHeaders();

		headers.set("api-key", coinCubeApiKey);
		headers.set("api-secret", coinCubeApiSecret);
		
		HttpEntity<CoinCubeSummary> entityReq = new HttpEntity<CoinCubeSummary>(null, headers);

		RestTemplate template = new RestTemplate();

		ResponseEntity<CoinCubeSummary> respEntity = template.exchange(coinCubeApiUrl, HttpMethod.POST, entityReq,
				CoinCubeSummary.class);		
		return respEntity.getBody();	
	}

	/**
	 * Method to send data to airtable
	 * @param balance
	 * @return
	 */
	private void postToAirtable(List<AirTableData> data) {
		
		for (AirTableData d : data) {
			log.info("Posting data to airtable {} ", dateFormat.format(new Date()));
			log.info("Balance name: "+d.getFields().getName());
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer "+airTableApiKey);
			HttpEntity<AirTableData> entityReq = new HttpEntity<AirTableData>(d, headers);
			RestTemplate template = new RestTemplate();
			template.exchange(airtableUrl, HttpMethod.POST, entityReq,
					Object.class);
			log.info("Posted...");
		}
	}

}
