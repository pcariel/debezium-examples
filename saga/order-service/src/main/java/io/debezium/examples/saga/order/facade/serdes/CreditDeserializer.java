/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.examples.saga.order.facade.serdes;

import io.debezium.examples.saga.order.event.CreditApprovalEventPayload;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CreditDeserializer extends ObjectMapperDeserializer<CreditApprovalEventPayload> {

    public CreditDeserializer() {
        super(CreditApprovalEventPayload.class);
    }
}
