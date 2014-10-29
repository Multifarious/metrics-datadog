package io.ifar.datadog.metrics;

public interface MetricNameFormatter {
    public String format(String name, String... path);
}