/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
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
package org.operaton.bpm.engine.impl.bpmn.behavior;

import org.operaton.bpm.engine.impl.bpmn.parser.ConditionalEventDefinition;
import org.operaton.bpm.engine.impl.core.variable.event.VariableEvent;
import org.operaton.bpm.engine.impl.persistence.entity.EventSubscriptionEntity;

/**
 * Represents an interface for the condition event behaviors.
 * Makes it possible to leave the current activity if the condition of the
 * conditional event is satisfied.
 *
 * @author Christopher Zell <christopher.zell@camunda.com>
 */
public interface ConditionalEventBehavior {

  /**
   * Returns the current conditional event definition.
   *
   * @return the conditional event definition
   */
  ConditionalEventDefinition getConditionalEventDefinition();

  /**
   * Checks the condition, on satisfaction the activity is leaved.
   *
   * @param eventSubscription the event subscription which contains all necessary informations
   * @param variableEvent the variableEvent to evaluate the condition
   */
  void leaveOnSatisfiedCondition(final EventSubscriptionEntity eventSubscription, final VariableEvent variableEvent);
}
