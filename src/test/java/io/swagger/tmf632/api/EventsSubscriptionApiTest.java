/*
 * API Party
 * ## TMF API Reference : TMF 632 - Party   ### Release : 19.0   The party API provides standardized mechanism for party management such as creation, update, retrieval, deletion and notification of events. Party can be an individual or an organization that has any kind of relation with the enterprise. Party is created to record individual or organization information before the assignment of any role. For example, within the context of a split billing mechanism, Party API allows creation of the individual or organization that will play the role of 3 rd payer for a given offer and, then, allows consultation or update of his information.  ### Resources - Organization - Individual - Hub  Party API performs the following operations : - Retrieve an organization or an individual - Retrieve a collection of organizations or individuals according to given criteria - Create a new organization or a new individual - Update an existing organization or an existing individual - Delete an existing organization or an existing individual - Notify events on organizatin or individual
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.tmf632.api;

import io.swagger.tmf632.model.EventSubscription;
import io.swagger.tmf632.model.EventSubscriptionInput;
import org.junit.Ignore;
import org.junit.Test;


/**
 * API tests for EventsSubscriptionApi
 */
@Ignore
public class EventsSubscriptionApiTest {

    private final io.swagger.tmf632.api.EventsSubscriptionApi api = new EventsSubscriptionApi();

    /**
     * Register a listener
     *
     * Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerListenerTest() throws Exception {
        EventSubscriptionInput body = null;
        EventSubscription response = api.registerListener(body);

        // TODO: test validations
    }
    /**
     * Unregister a listener
     *
     * Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterListenerTest() throws Exception {
        String id = null;
        api.unregisterListener(id);

        // TODO: test validations
    }
}
