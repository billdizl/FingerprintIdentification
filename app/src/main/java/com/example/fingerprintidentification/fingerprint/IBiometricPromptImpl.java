package com.example.fingerprintidentification.fingerprint;

import android.os.CancellationSignal;
import android.support.annotation.NonNull;

/**
 * Created by liang on 2019/06/13.
 */
interface IBiometricPromptImpl {

    void authenticate(@NonNull CancellationSignal cancel,
                      @NonNull BiometricPromptManager.OnBiometricIdentifyCallback callback);

}
