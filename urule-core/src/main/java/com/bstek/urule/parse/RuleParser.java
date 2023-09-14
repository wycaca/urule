/*******************************************************************************
 * Copyright 2017 Bstek
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.bstek.urule.parse;

import com.bstek.urule.model.rule.Rule;
import org.dom4j.Element;

/**
 * @author Jacky.gao
 * @since 2014年12月23日
 */
public class RuleParser extends AbstractRuleParser<Rule> {
    public Rule parse(Element element) {
        Rule rule = new Rule();
        parseRule(rule, element);
        return rule;
    }

    public boolean support(String name) {
        return name.equals("rule");
    }
}
