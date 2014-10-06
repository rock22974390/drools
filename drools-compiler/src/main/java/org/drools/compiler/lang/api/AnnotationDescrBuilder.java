/*
 * Copyright 2011 JBoss Inc
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

package org.drools.compiler.lang.api;

import org.drools.compiler.lang.descr.AnnotationDescr;

/**
 *  A descriptor builder for annotations
 */
public interface AnnotationDescrBuilder<P extends DescrBuilder< ? , ? >>
    extends
    DescrBuilder<P, AnnotationDescr>,
    AnnotatedDescrBuilder<AnnotationDescrBuilder<P>> {

    public AnnotationDescrBuilder<P> value( Object value );

    public AnnotationDescrBuilder<P> keyValue( String key,
                                               Object value );

}
