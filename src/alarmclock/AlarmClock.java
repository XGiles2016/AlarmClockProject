package alarmclock;

/** Interface for a simple alarm clock.

   This source code is from the book
     "Flexible, Reliable Software:
       Using Patterns and Agile Development"
     published 2010 by CRC Press.
   Author:
     Henrik B Christensen
     Department of Computer Science
     Aarhus University

   Please visit http://www.baerbak.com/ for further information.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/
public interface AlarmClock {
  /** return the contents of the display depending on the
   * state of the alarm clock.
   * @return the display contents
   */
  public String readDisplay();

  /** press the "AlarmSet" button on the clock */
  public void AlarmSet();

  /** press the "ClockSet" button on the clock */
  public void ClockSet();

  /** press the "increase" (+) button on the clock */
  public void increase();

  /** press the "decrease" (-) button on the clock */
  public void decrease();
}