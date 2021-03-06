// Copyright 2011 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfa.lib.conf;

import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.apache.commons.configuration.Configuration;

/**
 * Configuration information for DFA library.
 */
public class DfaApiConfiguration extends AdsApiConfiguration {

  public static final String NAMESPACE_PREFIX_KEY = "api.dfa.namespace.prefix";

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public DfaApiConfiguration(@Named("api") Configuration config) {
    super(config);
  }

  @Override
  public String getNamespacePrefix() {
    return getString(NAMESPACE_PREFIX_KEY);
  }
}
