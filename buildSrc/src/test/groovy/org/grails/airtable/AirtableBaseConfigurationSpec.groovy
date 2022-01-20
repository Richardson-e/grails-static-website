package org.grails.airtable

import io.micronaut.inject.qualifiers.Qualifiers

class AirtableBaseConfigurationSpec extends ApplicationContextSpecification {
    @Override
    Map<String, Object> getConfiguration() {
        super.configuration + [
                'airtable.api-key': 'secret',
                'airtable.bases.2022.id': 'appxxxyyy',
        ]
    }

    void "bean of type AirtableBaseConfiguration named 2022 exists"() {
        expect:
        applicationContext.containsBean(AirtableBaseConfiguration, Qualifiers.byName("2022"))
    }
}
