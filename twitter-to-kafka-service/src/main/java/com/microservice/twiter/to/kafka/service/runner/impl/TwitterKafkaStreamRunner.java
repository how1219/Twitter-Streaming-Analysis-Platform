package com.microservice.twiter.to.kafka.service.runner.impl;

import com.microservice.twiter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import com.microservice.twiter.to.kafka.service.listener.TwitterKafkaServiceListener;
import com.microservice.twiter.to.kafka.service.runner.StreamRunner;
import org.springframework.stereotype.Component;
import twitter4j.TwitterException;
import twitter4j.TwitterStream;

@Component
public class TwitterKafkaStreamRunner implements StreamRunner {
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    private final TwitterKafkaServiceListener twitterKafkaServiceListener;
    private TwitterStream twitterStream;
    public TwitterKafkaStreamRunner(TwitterToKafkaServiceConfigData configData,
                                    TwitterKafkaServiceListener statusListener) {
        this.twitterToKafkaServiceConfigData = configData;
        this.twitterKafkaServiceListener = statusListener;
    }
    @Override
    public void start() throws TwitterException {

    }
}
