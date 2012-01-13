/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.deri.any23.extractor.xpath;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

/**
 * Represents an <i>Quad</i> graph <i>URI template</i>.
 *
 * @author Michele Mostarda (mostarda@fbk.eu)
 */
public class TemplateGraph extends Term<URI> {

    /**
     * Constructor.
     *
     * @param value internal value.
     * @param isVar if <code>true</code> it the given <code>value</code>
     *              will be resolved with the variable value.
     */
    public TemplateGraph(String value, boolean isVar) {
        super(value, isVar);
    }

    @Override
    protected URI getValueInternal(String value) {
        return new URIImpl(value);
    }

    @Override
    public String toString() {
        return "<" + super.toString() + ">";
    }
}
