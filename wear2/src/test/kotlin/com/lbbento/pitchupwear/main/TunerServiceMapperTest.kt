package com.lbbento.pitchupwear.main

import com.lbbento.pitchuptuner.service.TunerResult
import com.lbbento.pitchuptuner.service.TuningStatus.TUNED
import org.junit.Assert.assertEquals
import org.junit.Test

class TunerServiceMapperTest {

    val tunerServiceMapper = TunerServiceMapper()

    @Test
    fun tunerResultToViewModel() {
        val tunerResult = TunerResult("A", TUNED, 100.0, 20.0)
        val expectedTunerViewModel = TunerViewModel("A", TUNED, 100.0, 20.0)

        assertEquals(expectedTunerViewModel, tunerServiceMapper.tunerResultToViewModel(tunerResult))
    }

}