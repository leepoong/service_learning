package com.tencent.lp.service_learning.entity;

import java.util.List;
import java.util.Map;

public class RspData {
    private String rowkey;
    private List<String> ips;
    private Map<Long, Map<String, Float>> item;

    public RspData() {
    }

    public RspData(String rowkey, List<String> ips, Map<Long, Map<String, Float>> item) {
        this.rowkey = rowkey;
        this.ips = ips;
        this.item = item;
    }

    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public Map<Long, Map<String, Float>> getItem() {
        return item;
    }

    public void setItem(Map<Long, Map<String, Float>> item) {
        this.item = item;
    }
}
