package net.org.selector.petsroom.web.rest.util;

import org.springframework.http.HttpHeaders;

/**
 * Utility class for http header creation.
 */
public class HeaderUtil {

    public static HttpHeaders createAlert(String message, String param) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-petsroomApp-alert", message);
        headers.add("X-petsroomApp-params", param);
        return headers;
    }

    public static HttpHeaders createEntityCreationAlert(String entityName, String param) {
        return createAlert("petsroomApp." + entityName + ".created", param);
    }

    public static HttpHeaders createEntityUpdateAlert(String entityName, String param) {
        return createAlert("petsroomApp." + entityName + ".updated", param);
    }

    public static HttpHeaders createEntityDeletionAlert(String entityName, String param) {
        return createAlert("petsroomApp." + entityName + ".deleted", param);
    }

}
