// Copyright 2019 The OpenSDS Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may
// not use this file except in compliance with the License. You may obtain
// a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// License for the specific language governing permissions and limitations
// under the License.

#ifndef REPLICATION_SETTING_H
#define REPLICATION_SETTING_H

#include "../xmlserial/xmlserializable.h"
#include "../common.h"
#include "target_device.h"

class ReplicationSettingInfo: public XmlSerializable
{
public:
    virtual ~ReplicationSettingInfo();
    ReplicationSettingInfo();

public:
    void writeXml(XmlWriter *writer);
    void readXml(XmlReader *reader);

public:
    list<TargetDeviceInfo> target_device;
};

#endif

