package grailsviewbug

import grails.plugin.json.builder.JsonGenerator

import java.time.Duration

class DurationConverter implements JsonGenerator.Converter  {
  @Override
  boolean handles(Class<?> type) {
    return Duration.isAssignableFrom(type)
  }

  @Override
  Object convert(Object value, String key) {
    return ((Duration)value).toMillis()
  }
}
