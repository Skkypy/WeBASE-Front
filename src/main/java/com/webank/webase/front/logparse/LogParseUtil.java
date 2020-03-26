/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.webank.webase.front.logparse;

import com.webank.webase.front.logparse.entity.NetWorkData;
import com.webank.webase.front.logparse.entity.TxGasData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * FileUtil.
 * format abi types from String
 */
public class LogParseUtil {

    public static LogTypes getLogType(String log) {
        return LogTypes.UNKNOWN;
    }

    public static NetWorkData parseNetworkLog(String log) {
        return null;
    }

    public static TxGasData parseTxGasUsedLog(String log) {
        return null;
    }
}