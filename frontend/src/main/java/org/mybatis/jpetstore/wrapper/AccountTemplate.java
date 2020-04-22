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
import net.sourceforge.stripes.validation.Validate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@Component
@FeignClient(name = "account-service", url = "http://localhost:8084")
@RibbonClient(name = "account-service")
public interface AccountTemplate {
  @GetMapping("/AccountService/")
  public int createAccount();

  @GetMapping("/AccountService/{proxy_id}/getAddress1")
  public JsonNode getAddress1(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getAddress2")
  public JsonNode getAddress2(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getBannerName")
  public JsonNode getBannerName(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getCity")
  public JsonNode getCity(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getCountry")
  public JsonNode getCountry(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getEmail")
  public JsonNode getEmail(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getFavouriteCategoryId")
  public JsonNode getFavouriteCategoryId(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getFirstName")
  public JsonNode getFirstName(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getLanguagePreference")
  public JsonNode getLanguagePreference(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getLastName")
  public JsonNode getLastName(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getPassword")
  public JsonNode getPassword(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getPhone")
  public JsonNode getPhone(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getState")
  public JsonNode getState(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getStatus")
  public JsonNode getStatus(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getUsername")
  public JsonNode getUsername(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/getZip")
  public JsonNode getZip(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/isBannerOption")
  public JsonNode isBannerOption(@PathVariable int proxy_id);

  @GetMapping("/AccountService/{proxy_id}/isListOption")
  public JsonNode isListOption(@PathVariable int proxy_id);

  @PostMapping("/AccountService/{proxy_id}/setAddress1")
  public JsonNode setAddress1(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setAddress2")
  public JsonNode setAddress2(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setBannerName")
  public JsonNode setBannerName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setBannerOption")
  public JsonNode setBannerOption(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setCity")
  public JsonNode setCity(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setCountry")
  public JsonNode setCountry(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setEmail")
  public JsonNode setEmail(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setFavouriteCategoryId")
  public JsonNode setFavouriteCategoryId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Validate(required = true, on = { "newAccount", "editAccount" })
  @PostMapping("/AccountService/{proxy_id}/setFirstName")
  public JsonNode setFirstName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setLanguagePreference")
  public JsonNode setLanguagePreference(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Validate(required = true, on = { "newAccount", "editAccount" })
  @PostMapping("/AccountService/{proxy_id}/setLastName")
  public JsonNode setLastName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setListOption")
  public JsonNode setListOption(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setPassword")
  public JsonNode setPassword(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setPhone")
  public JsonNode setPhone(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setState")
  public JsonNode setState(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setStatus")
  public JsonNode setStatus(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setUsername")
  public JsonNode setUsername(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/AccountService/{proxy_id}/setZip")
  public JsonNode setZip(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/AccountServiceService/")
  public int createAccountService();

  @PostMapping("/AccountServiceService/{proxy_id}/getAccount")
  public JsonNode getAccount(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Transactional
  @PostMapping("/AccountServiceService/{proxy_id}/insertAccount")
  public JsonNode insertAccount(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Transactional
  @PostMapping("/AccountServiceService/{proxy_id}/updateAccount")
  public JsonNode updateAccount(@PathVariable int proxy_id, @RequestBody JsonNode node);
}
