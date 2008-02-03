--  Licensed under the Apache License, Version 2.0 (the "License");
--  you may not use this file except in compliance with the License.
--  You may obtain a copy of the License at
--
--      http://www.apache.org/licenses/LICENSE-2.0
--
--  Unless required by applicable law or agreed to in writing, software
--  distributed under the License is distributed on an "AS IS" BASIS,
--  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--  See the License for the specific language governing permissions and
--  limitations under the License.

--
--  Script that declares functions emulating DB2 date/time functions. Note
--  that the DB2 functions accept DATE, TIMESTAMP and CHAR values, whereas
--  the emulation functions only accept DATE values. In accordance with the
--  DB2 behaviour, all functions are defined to return NULL if the
--  argument is NULL.
--
--  $Id$
--

CREATE FUNCTION DAYOFWEEK (DATE_VALUE DATE)
	RETURNS INTEGER
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.dayOfWeek'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;

CREATE FUNCTION DAYOFWEEK_ISO (DATE_VALUE DATE)
	RETURNS INTEGER
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.dayOfWeekIso'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;

CREATE FUNCTION DAYOFYEAR (DATE_VALUE DATE)
	RETURNS INTEGER
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.dayOfYear'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;

CREATE FUNCTION LAST_DAY (DATE_VALUE DATE)
	RETURNS DATE
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.lastDay'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;

CREATE FUNCTION WEEK (DATE_VALUE DATE)
	RETURNS INTEGER
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.week'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;

CREATE FUNCTION WEEK_ISO (DATE_VALUE DATE)
	RETURNS INTEGER
	LANGUAGE JAVA
	EXTERNAL NAME 'net.sf.springderby.proc.DB2DateTimeFunctions.weekIso'
	PARAMETER STYLE JAVA
	NO SQL
	RETURNS NULL ON NULL INPUT;
