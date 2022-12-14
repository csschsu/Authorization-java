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
import io.swagger.tmf632.model.IndividualAttributeValueChangeEvent;
import io.swagger.tmf632.model.IndividualCreateEvent;
import io.swagger.tmf632.model.IndividualDeleteEvent;
import io.swagger.tmf632.model.IndividualStateChangeEvent;
import io.swagger.tmf632.model.OrganizationAttributeValueChangeEvent;
import io.swagger.tmf632.model.OrganizationCreateEvent;
import io.swagger.tmf632.model.OrganizationDeleteEvent;
import io.swagger.tmf632.model.OrganizationStateChangeEvent;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for NotificationListenersClientSideApi
 */
@Ignore
public class NotificationListenersClientSideApiTest {

    private final io.swagger.tmf632.api.NotificationListenersClientSideApi api = new NotificationListenersClientSideApi();

    /**
     * Client listener for entity IndividualAttributeValueChangeEvent
     *
     * Example of a client listener for receiving the notification IndividualAttributeValueChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToIndividualAttributeValueChangeEventTest() throws Exception {
        IndividualAttributeValueChangeEvent body = null;
        EventSubscription response = api.listenToIndividualAttributeValueChangeEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity IndividualCreateEvent
     *
     * Example of a client listener for receiving the notification IndividualCreateEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToIndividualCreateEventTest() throws Exception {
        IndividualCreateEvent body = null;
        EventSubscription response = api.listenToIndividualCreateEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity IndividualDeleteEvent
     *
     * Example of a client listener for receiving the notification IndividualDeleteEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToIndividualDeleteEventTest() throws Exception {
        IndividualDeleteEvent body = null;
        EventSubscription response = api.listenToIndividualDeleteEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity IndividualStateChangeEvent
     *
     * Example of a client listener for receiving the notification IndividualStateChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToIndividualStateChangeEventTest() throws Exception {
        IndividualStateChangeEvent body = null;
        EventSubscription response = api.listenToIndividualStateChangeEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity OrganizationAttributeValueChangeEvent
     *
     * Example of a client listener for receiving the notification OrganizationAttributeValueChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToOrganizationAttributeValueChangeEventTest() throws Exception {
        OrganizationAttributeValueChangeEvent body = null;
        EventSubscription response = api.listenToOrganizationAttributeValueChangeEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity OrganizationCreateEvent
     *
     * Example of a client listener for receiving the notification OrganizationCreateEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToOrganizationCreateEventTest() throws Exception {
        OrganizationCreateEvent body = null;
        EventSubscription response = api.listenToOrganizationCreateEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity OrganizationDeleteEvent
     *
     * Example of a client listener for receiving the notification OrganizationDeleteEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToOrganizationDeleteEventTest() throws Exception {
        OrganizationDeleteEvent body = null;
        EventSubscription response = api.listenToOrganizationDeleteEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity OrganizationStateChangeEvent
     *
     * Example of a client listener for receiving the notification OrganizationStateChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToOrganizationStateChangeEventTest() throws Exception {
        OrganizationStateChangeEvent body = null;
        EventSubscription response = api.listenToOrganizationStateChangeEvent(body);

        // TODO: test validations
    }
}
