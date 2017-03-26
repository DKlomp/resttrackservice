package nl.hu.iac.rest;

import nl.hu.iac.service.ServiceProvider;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daan on 26-3-2017.
 */
public class TrackRestServiceTest {
    @Test
    public void getMean() throws Exception {
        String list = "1 2 2  4 43 2 2 3 3 436 6 34 36";
        assertEquals("44.0", ServiceProvider.getTrackService().getMean(list));
    }

    @Test
    public void getVariance() throws Exception {
        String list = "1 2 2  4 43 2 2 3 3 436 6 34 36";
        assertEquals("169140.0", ServiceProvider.getTrackService().getVariance(list));
    }

    @Test
    public void getStd() throws Exception {
        String list = "1 2 2  4 43 2 2 3 3 436 6 34 36";
        assertEquals("114.06475893442826", ServiceProvider.getTrackService().getStd(list));
    }

}