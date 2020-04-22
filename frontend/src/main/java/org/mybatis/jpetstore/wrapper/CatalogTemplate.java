/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.wrapper;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "catalog-service", url = "http://localhost:8083")
@RibbonClient(name = "catalog-service")
public interface CatalogTemplate {

  @GetMapping("/ItemService/")
  public int createItem();

  @GetMapping("/ItemService/{proxy_id}/getAttribute1")
  public JsonNode getAttribute1(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getAttribute2")
  public JsonNode getAttribute2(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getAttribute3")
  public JsonNode getAttribute3(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getAttribute4")
  public JsonNode getAttribute4(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getAttribute5")
  public JsonNode getAttribute5(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getItemId")
  public JsonNode getItemId(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getListPrice")
  public JsonNode getListPrice(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getProduct")
  public JsonNode getProduct(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getQuantity")
  public JsonNode getQuantity(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getStatus")
  public JsonNode getStatus(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getSupplierId")
  public JsonNode getSupplierId(@PathVariable int proxy_id);

  @GetMapping("/ItemService/{proxy_id}/getUnitCost")
  public JsonNode getUnitCost(@PathVariable int proxy_id);

  @PostMapping("/ItemService/{proxy_id}/setAttribute1")
  public JsonNode setAttribute1(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setAttribute2")
  public JsonNode setAttribute2(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setAttribute3")
  public JsonNode setAttribute3(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setAttribute4")
  public JsonNode setAttribute4(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setAttribute5")
  public JsonNode setAttribute5(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setItemId")
  public JsonNode setItemId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setListPrice")
  public JsonNode setListPrice(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setProduct")
  public JsonNode setProduct(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setQuantity")
  public JsonNode setQuantity(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setStatus")
  public JsonNode setStatus(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setSupplierId")
  public JsonNode setSupplierId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ItemService/{proxy_id}/setUnitCost")
  public JsonNode setUnitCost(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/CategoryService/")
  public int createCategory();

  @GetMapping("/CatalogServiceService/")
  public int createCatalogService();

  @PostMapping("/CatalogServiceService/{proxy_id}/getCategory")
  public JsonNode getCategory(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/CatalogServiceService/{proxy_id}/getCategoryList")
  public JsonNode getCategoryList(@PathVariable int proxy_id);

  @PostMapping("/CatalogServiceService/{proxy_id}/getItem")
  public JsonNode getItem(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CatalogServiceService/{proxy_id}/getItemListByProduct")
  public JsonNode getItemListByProduct(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CatalogServiceService/{proxy_id}/getProduct")
  public JsonNode getProduct(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CatalogServiceService/{proxy_id}/getProductListByCategory")
  public JsonNode getProductListByCategory(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CatalogServiceService/{proxy_id}/isItemInStock")
  public JsonNode isItemInStock(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CatalogServiceService/{proxy_id}/searchProductList")
  public JsonNode searchProductList(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/ProductService/")
  public int createProduct();

  @GetMapping("/ProductService/{proxy_id}/getCategoryId")
  public JsonNode getCategoryId(@PathVariable int proxy_id);

  @GetMapping("/ProductService/{proxy_id}/getDescription")
  public JsonNode getDescription(@PathVariable int proxy_id);

  @GetMapping("/ProductService/{proxy_id}/getName")
  public JsonNode getName(@PathVariable int proxy_id);

  @GetMapping("/ProductService/{proxy_id}/getProductId")
  public JsonNode getProductId(@PathVariable int proxy_id);

  @PostMapping("/ProductService/{proxy_id}/setCategoryId")
  public JsonNode setCategoryId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ProductService/{proxy_id}/setDescription")
  public JsonNode setDescription(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ProductService/{proxy_id}/setName")
  public JsonNode setName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/ProductService/{proxy_id}/setProductId")
  public JsonNode setProductId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/ProductService/{proxy_id}/toString")
  public JsonNode toString(@PathVariable int proxy_id);
}
