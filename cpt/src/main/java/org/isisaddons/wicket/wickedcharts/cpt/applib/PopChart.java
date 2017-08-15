/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.wicket.wickedcharts.cpt.applib;

import java.io.Serializable;

import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.Title;

import org.apache.isis.applib.annotation.Programmatic;
import org.apache.isis.applib.annotation.Value;

@Value(semanticsProviderClass=PopChartSemanticsProvider.class)
public class PopChart implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Options options;
    
    public PopChart(Options options) {
        this.options = options;
    }

    public String title() {
        Title title = getOptions().getTitle();
        return title != null? title.getText(): "Pop Chart";
    }
    
    @Programmatic
    public Options getOptions() {
        return options;
    }
}
