#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

final shared-library = library('shared-library')
def call(String filter_string, int occurrence) {
    def logs = currentBuild.rawBuild.getLog(10000).join('\n')
    int count = StringUtils.countMatches(logs, filter_string);
    if (count > occurrence -1) {
        currentBuild.result='UNSTABLE'
    }
    return this
}

def verify(String filter_string, int occurrence) {
    echo 'verify from shared lib'
}

