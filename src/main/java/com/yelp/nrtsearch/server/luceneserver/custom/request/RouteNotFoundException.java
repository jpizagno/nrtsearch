/*
 * Copyright 2022 Yelp Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yelp.nrtsearch.server.luceneserver.custom.request;

import java.text.MessageFormat;

public class RouteNotFoundException extends RuntimeException {

  public RouteNotFoundException(String id) {
    super(MessageFormat.format("No routes found for id {0}", id));
  }

  public RouteNotFoundException(String id, String path) {
    super(MessageFormat.format("Path {0} not found for id {1}", path, id));
  }
}
