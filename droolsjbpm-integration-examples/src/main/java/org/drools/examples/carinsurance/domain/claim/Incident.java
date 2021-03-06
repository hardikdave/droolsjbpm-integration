/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.examples.carinsurance.domain.claim;

import org.drools.examples.carinsurance.domain.policy.Policy;
import org.joda.time.LocalDate;

import java.util.List;

public class Incident {

    private Policy policy;
    private LocalDate date;

    private List<Claim> claimList;

    // ############################################################################
    // Non getters and setters
    // ############################################################################

}
