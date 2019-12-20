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

package org.opensds.vasa.vasa20.device.array.NFSshare;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 功能描述
 *
 * @author h00451513
 * @since 2019-02-28
 */
public class NFSshareCreateResBean {

    @JsonProperty
    private String ID;

    @JsonProperty
    private String DESCRIPTION;

    @JsonProperty
    private String SHAREPATH;

    @JsonProperty
    private String FSID;

    @Override
    public String toString() {
        return "NFSshareCreateResBean{" +
                "ID='" + ID + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", SHAREPATH='" + SHAREPATH + '\'' +
                ", FSID='" + FSID + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getSHAREPATH() {
        return SHAREPATH;
    }

    public void setSHAREPATH(String SHAREPATH) {
        this.SHAREPATH = SHAREPATH;
    }

    public String getFSID() {
        return FSID;
    }

    public void setFSID(String FSID) {
        this.FSID = FSID;
    }
}
