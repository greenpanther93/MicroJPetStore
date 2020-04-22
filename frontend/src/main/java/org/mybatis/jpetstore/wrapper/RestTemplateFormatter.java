package org.mybatis.jpetstore.wrapper;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

public class RestTemplateFormatter {

  /**
   * if the request node is null then it's assumed the HTTPRequest is GET, otherwise it's a POST
   * 
   * @param port
   * @param serviceName
   * @param proxy_id
   * @param method_name
   * @param request
   * @return
   */
  public static JsonNode sendHTTPRequest(String address, String port, String serviceName, String proxy_id,
      String method_name, JsonNode requestbody) {
    RestTemplate restTemplate = new RestTemplate();
    URI url = null;
    try {
      url = new URI("http://" + address + ":" + port + "/" + serviceName + "/" + proxy_id + "/" + method_name);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    ResponseEntity<JsonNode> result = null;
    if (requestbody != null)
      result = restTemplate.postForEntity(url, requestbody, JsonNode.class);
    else
      result = restTemplate.getForEntity(url, JsonNode.class);
    System.out.println(result.getBody());
    return result.getBody();
  }

  public static int sendCreateHTTPRequest(String address, String port, String serviceName) {
    RestTemplate restTemplate = new RestTemplate();
    URI url = null;
    try {
      url = new URI("http://" + address + ":" + port + "/" + serviceName + "/");
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    ResponseEntity<Integer> result = restTemplate.getForEntity(url, Integer.class);
    System.out.println(result.getBody());
    return result.getBody();
  }
}
