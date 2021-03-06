/*
 * Copyright 2010 - 2012 Ed Venaglia
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package net.venaglia.nondairy.soylang.lexer.cupparser.structure.tag;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jul 24, 2010
 * Time: 7:39:17 PM
 */
public class BeginCallTag extends BeginTag {

    private final String templateName;

    public BeginCallTag(String templateName) {
        this(templateName, null);
    }

    public BeginCallTag(String templateName, List<Attribute> attributes) {
        super("call", attributes);
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }
}
