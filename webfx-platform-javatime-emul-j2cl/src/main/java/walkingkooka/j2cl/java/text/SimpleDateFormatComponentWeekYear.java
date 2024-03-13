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

package walkingkooka.j2cl.java.text;

import walkingkooka.j2cl.java.util.calendar.Calendar;

final class SimpleDateFormatComponentWeekYear extends SimpleDateFormatComponentNumber {

    final static char LETTER = WEEK_YEAR;

    static SimpleDateFormatComponentWeekYear with(final int patternLength,
                                                  final int maxDigitLength) {
        return new SimpleDateFormatComponentWeekYear(patternLength,
                maxDigitLength);
    }

    private SimpleDateFormatComponentWeekYear(final int patternLength,
                                              final int maxDigitLength) {
        super(patternLength, maxDigitLength);
    }

    @Override
    SimpleDateFormatComponentWeekYear setNumberNext() {
        final int length = this.length;
        return new SimpleDateFormatComponentWeekYear(length, 2 == length ? 2 : 4);
    }

    // formatDate.......................................................................................................

    @Override
    int calendarField() {
        return Calendar.YEAR;
    }

    @Override
    int adjustReadValue(final int value) {
        return 2 == this.length ?
                value % 100 : // length = 2 then two digits year
                value;
    }

    // parse............................................................................................................

    @Override
    int adjustWriteValue(final int value,
                         final SimpleDateFormatParseRequest parse) {
        return this.adjustWriteYearValue(value, parse);
    }

    // SimpleDateFormatComponent2.......................................................................................

    @Override
    char letter() {
        return LETTER;
    }
}