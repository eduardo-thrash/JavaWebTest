package payments;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {


    @Test
    public void payment_is_correct() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        boolean result =  paymentProcessor.makePayment(1000);

        assertTrue(result);

    }


}