/*
 * // Copyright 2019 The OpenSDS Authors.
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License"); you may
 * // not use this file except in compliance with the License. You may obtain
 * // a copy of the License at
 * //
 * //     http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * // WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * // License for the specific language governing permissions and limitations
 * // under the License.
 *
 */

package org.opensds.vasa.vasa.db.model;

import java.util.Date;

public class NVmwareCertificateSync {

    private int id;

    private int vcid;

    private String syncIp;

    private Date syncTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVcid() {
        return vcid;
    }

    public void setVcid(int vcid) {
        this.vcid = vcid;
    }

    public String getSyncIp() {
        return syncIp;
    }

    public void setSyncIp(String syncIp) {
        this.syncIp = syncIp;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NVmwareCertificateSync [id=").append(id).append(", vcid=").append(vcid).append(", syncIp=")
                .append(syncIp).append(", syncTime=").append(syncTime).append("]");
        return builder.toString();
    }


}
