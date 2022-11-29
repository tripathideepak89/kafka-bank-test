package io.confluent.developer;

public class KafkaMainApplication {


    public KafkaMainApplication() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new IllegalArgumentException(
                    "This program takes two arguments: the path to an environment configuration file and" +
                            "the path to the file with records to send");
        }
        KafkaProducerApplication.kafkaProducer(args);
        KafkaConsumerApplication.kafkaConsumer(args);
     
    }
}

