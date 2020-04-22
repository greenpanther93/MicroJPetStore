package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "catalog-service")
@RibbonClient(name = "catalog-service")
public interface CatalogTemplate {
    @GetMapping("/ItemService/")
    public int createItem();

    @GetMapping("/ItemService/{proxy_id}/getAttribute1")
    public JsonNode getAttribute1(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getAttribute2")
    public JsonNode getAttribute2(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getAttribute3")
    public JsonNode getAttribute3(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getAttribute4")
    public JsonNode getAttribute4(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getAttribute5")
    public JsonNode getAttribute5(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getItemId")
    public JsonNode getItemId(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getListPrice")
    public JsonNode getListPrice(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getProduct")
    public JsonNode getProduct(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getQuantity")
    public JsonNode getQuantity(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getStatus")
    public JsonNode getStatus(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getSupplierId")
    public JsonNode getSupplierId(@PathVariable
    int proxy_id);

    @GetMapping("/ItemService/{proxy_id}/getUnitCost")
    public JsonNode getUnitCost(@PathVariable
    int proxy_id);

    @PostMapping("/ItemService/{proxy_id}/setAttribute1")
    public JsonNode setAttribute1(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setAttribute2")
    public JsonNode setAttribute2(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setAttribute3")
    public JsonNode setAttribute3(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setAttribute4")
    public JsonNode setAttribute4(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setAttribute5")
    public JsonNode setAttribute5(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setItemId")
    public JsonNode setItemId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setListPrice")
    public JsonNode setListPrice(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setProduct")
    public JsonNode setProduct(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setQuantity")
    public JsonNode setQuantity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setStatus")
    public JsonNode setStatus(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setSupplierId")
    public JsonNode setSupplierId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @PostMapping("/ItemService/{proxy_id}/setUnitCost")
    public JsonNode setUnitCost(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node);

    @GetMapping("/ItemService/{proxy_id}/toString")
    public JsonNode toString(@PathVariable
    int proxy_id);
}

