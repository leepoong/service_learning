package com.tencent.lp.service_learning.entity;


import java.util.List;

public class Req {
    private long beginTime;
    private long endTime;
    private Integer granularity;
    private Filter filter;
    private List<RangeFilter> rangeFilters;
    private long limitCnt = 100;

    public Integer getGranularity() {
        return granularity;
    }

    public void setGranularity(Integer granularity) {
        this.granularity = granularity;
    }

    public long getLimitCnt() {
        return limitCnt;
    }

    public void setLimitCnt(long limitCnt) {
        this.limitCnt = limitCnt;
    }

    public List<RangeFilter> getRangeFilters() {
        return rangeFilters;
    }

    public void setRangeFilters(List<RangeFilter> rangeFilters) {
        this.rangeFilters = rangeFilters;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public static class Filter {
        private String filterName;
        private String filterValue;

        public Filter(String filterName, String filterValue) {
            this.filterName = filterName;
            this.filterValue = filterValue;
        }

        public Filter() {
        }

        public String getFilterName() {
            return filterName;
        }

        public void setFilterName(String filterName) {
            this.filterName = filterName;
        }

        public String getFilterValue() {
            return filterValue;
        }

        public void setFilterValue(String filterValue) {
            this.filterValue = filterValue;
        }

        @Override
        public String toString() {
            return "Filter{" +
                    "filterName='" + filterName + '\'' +
                    ", filterValue='" + filterValue + '\'' +
                    '}';
        }
    }

    public static class RangeFilter {
        private String filterName;
        private Long lowValue;
        private Long highValue;

        public RangeFilter() {
        }

        public RangeFilter(String filterName, long lowValue, long highValue) {
            this.filterName = filterName;
            this.lowValue = lowValue;
            this.highValue = highValue;
        }

        public String getFilterName() {
            return filterName;
        }

        public void setFilterName(String filterName) {
            this.filterName = filterName;
        }

        public Long getLowValue() {
            return lowValue;
        }

        public void setLowValue(Long lowValue) {
            this.lowValue = lowValue;
        }

        public Long getHighValue() {
            return highValue;
        }

        public void setHighValue(Long highValue) {
            this.highValue = highValue;
        }

        @Override
        public String toString() {
            return "RangeFilter{" +
                    "filterName='" + filterName + '\'' +
                    ", lowValue=" + lowValue +
                    ", highValue=" + highValue +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Req{" +
                "beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", granularity=" + granularity +
                ", filter=" + filter +
                ", rangeFilters=" + rangeFilters +
                ", limitCnt=" + limitCnt +
                '}';
    }
}
