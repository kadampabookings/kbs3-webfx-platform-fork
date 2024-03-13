/*
 * Copyright 2019 Miroslav Pokorny (github.com/mP1)
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
 *
 */

package walkingkooka.j2cl.java.util.currency.generated;

public final class CurrencyProvider {

  public final static String ANNOTATION_PROCESSOR_LOCALES_FILTER = preventInlining("en-AU");

  public final static String SELECTED_LOCALES = preventInlining("en-AU");

// currencyCode=AUD
//   defaultFractionDigits=2
//   numericCode=36
//   defaultSymbol=A$
//   locales=en-AU
//   $=en-AU
// 
// currencyCode=XXX
//   defaultFractionDigits=-1
//   numericCode=999
//   defaultSymbol=XXX
//   locales=
//   ¤=en-AU
// 


  public final static String DATA = preventInlining("2,AUD,2,36,A$,1,en-AU,1,$,1,en-AU,XXX,-1,999,XXX,0,1,¤,1,en-AU");

  private static String preventInlining(final String string){
    return string;
  }
}
