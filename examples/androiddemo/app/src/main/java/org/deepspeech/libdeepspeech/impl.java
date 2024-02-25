
package org.deepspeech.libdeepspeech;

public class impl {
    public impl() {
    }

    public static SWIGTYPE_p_p_ModelState new_modelstatep() {
        long cPtr = implJNI.new_modelstatep();
        return cPtr == 0L ? null : new SWIGTYPE_p_p_ModelState(cPtr, false);
    }

    public static SWIGTYPE_p_p_ModelState copy_modelstatep(SWIGTYPE_p_ModelState value) {
        long cPtr = implJNI.copy_modelstatep(SWIGTYPE_p_ModelState.getCPtr(value));
        return cPtr == 0L ? null : new SWIGTYPE_p_p_ModelState(cPtr, false);
    }

    public static void delete_modelstatep(SWIGTYPE_p_p_ModelState obj) {
        implJNI.delete_modelstatep(SWIGTYPE_p_p_ModelState.getCPtr(obj));
    }

    public static void modelstatep_assign(SWIGTYPE_p_p_ModelState obj, SWIGTYPE_p_ModelState value) {
        implJNI.modelstatep_assign(SWIGTYPE_p_p_ModelState.getCPtr(obj), SWIGTYPE_p_ModelState.getCPtr(value));
    }

    public static SWIGTYPE_p_ModelState modelstatep_value(SWIGTYPE_p_p_ModelState obj) {
        long cPtr = implJNI.modelstatep_value(SWIGTYPE_p_p_ModelState.getCPtr(obj));
        return cPtr == 0L ? null : new SWIGTYPE_p_ModelState(cPtr, false);
    }

    public static SWIGTYPE_p_p_StreamingState new_streamingstatep() {
        long cPtr = implJNI.new_streamingstatep();
        return cPtr == 0L ? null : new SWIGTYPE_p_p_StreamingState(cPtr, false);
    }

    public static SWIGTYPE_p_p_StreamingState copy_streamingstatep(SWIGTYPE_p_StreamingState value) {
        long cPtr = implJNI.copy_streamingstatep(SWIGTYPE_p_StreamingState.getCPtr(value));
        return cPtr == 0L ? null : new SWIGTYPE_p_p_StreamingState(cPtr, false);
    }

    public static void delete_streamingstatep(SWIGTYPE_p_p_StreamingState obj) {
        implJNI.delete_streamingstatep(SWIGTYPE_p_p_StreamingState.getCPtr(obj));
    }

    public static void streamingstatep_assign(SWIGTYPE_p_p_StreamingState obj, SWIGTYPE_p_StreamingState value) {
        implJNI.streamingstatep_assign(SWIGTYPE_p_p_StreamingState.getCPtr(obj), SWIGTYPE_p_StreamingState.getCPtr(value));
    }

    public static SWIGTYPE_p_StreamingState streamingstatep_value(SWIGTYPE_p_p_StreamingState obj) {
        long cPtr = implJNI.streamingstatep_value(SWIGTYPE_p_p_StreamingState.getCPtr(obj));
        return cPtr == 0L ? null : new SWIGTYPE_p_StreamingState(cPtr, false);
    }

    public static int CreateModel(String aModelPath, SWIGTYPE_p_p_ModelState retval) {
        return implJNI.CreateModel(aModelPath, SWIGTYPE_p_p_ModelState.getCPtr(retval));
    }

    public static long GetModelBeamWidth(SWIGTYPE_p_ModelState aCtx) {
        return implJNI.GetModelBeamWidth(SWIGTYPE_p_ModelState.getCPtr(aCtx));
    }

    public static int SetModelBeamWidth(SWIGTYPE_p_ModelState aCtx, long aBeamWidth) {
        return implJNI.SetModelBeamWidth(SWIGTYPE_p_ModelState.getCPtr(aCtx), aBeamWidth);
    }

    public static int GetModelSampleRate(SWIGTYPE_p_ModelState aCtx) {
        return implJNI.GetModelSampleRate(SWIGTYPE_p_ModelState.getCPtr(aCtx));
    }

    public static void FreeModel(SWIGTYPE_p_ModelState ctx) {
        implJNI.FreeModel(SWIGTYPE_p_ModelState.getCPtr(ctx));
    }

    public static int EnableExternalScorer(SWIGTYPE_p_ModelState aCtx, String aScorerPath) {
        return implJNI.EnableExternalScorer(SWIGTYPE_p_ModelState.getCPtr(aCtx), aScorerPath);
    }

    public static int AddHotWord(SWIGTYPE_p_ModelState aCtx, String word, float boost) {
        return implJNI.AddHotWord(SWIGTYPE_p_ModelState.getCPtr(aCtx), word, boost);
    }

    public static int EraseHotWord(SWIGTYPE_p_ModelState aCtx, String word) {
        return implJNI.EraseHotWord(SWIGTYPE_p_ModelState.getCPtr(aCtx), word);
    }

    public static int ClearHotWords(SWIGTYPE_p_ModelState aCtx) {
        return implJNI.ClearHotWords(SWIGTYPE_p_ModelState.getCPtr(aCtx));
    }

    public static int DisableExternalScorer(SWIGTYPE_p_ModelState aCtx) {
        return implJNI.DisableExternalScorer(SWIGTYPE_p_ModelState.getCPtr(aCtx));
    }

    public static int SetScorerAlphaBeta(SWIGTYPE_p_ModelState aCtx, float aAlpha, float aBeta) {
        return implJNI.SetScorerAlphaBeta(SWIGTYPE_p_ModelState.getCPtr(aCtx), aAlpha, aBeta);
    }

    public static String SpeechToText(SWIGTYPE_p_ModelState aCtx, short[] aBuffer, long aBufferSize) {
        return implJNI.SpeechToText(SWIGTYPE_p_ModelState.getCPtr(aCtx), aBuffer, aBufferSize);
    }

    public static Metadata SpeechToTextWithMetadata(SWIGTYPE_p_ModelState aCtx, short[] aBuffer, long aBufferSize, long aNumResults) {
        long cPtr = implJNI.SpeechToTextWithMetadata(SWIGTYPE_p_ModelState.getCPtr(aCtx), aBuffer, aBufferSize, aNumResults);
        return cPtr == 0L ? null : new Metadata(cPtr, false);
    }

    public static int CreateStream(SWIGTYPE_p_ModelState aCtx, SWIGTYPE_p_p_StreamingState retval) {
        return implJNI.CreateStream(SWIGTYPE_p_ModelState.getCPtr(aCtx), SWIGTYPE_p_p_StreamingState.getCPtr(retval));
    }

    public static void FeedAudioContent(SWIGTYPE_p_StreamingState aSctx, short[] aBuffer, long aBufferSize) {
        implJNI.FeedAudioContent(SWIGTYPE_p_StreamingState.getCPtr(aSctx), aBuffer, aBufferSize);
    }

    public static String IntermediateDecode(SWIGTYPE_p_StreamingState aSctx) {
        return implJNI.IntermediateDecode(SWIGTYPE_p_StreamingState.getCPtr(aSctx));
    }

    public static Metadata IntermediateDecodeWithMetadata(SWIGTYPE_p_StreamingState aSctx, long aNumResults) {
        long cPtr = implJNI.IntermediateDecodeWithMetadata(SWIGTYPE_p_StreamingState.getCPtr(aSctx), aNumResults);
        return cPtr == 0L ? null : new Metadata(cPtr, false);
    }

    public static String FinishStream(SWIGTYPE_p_StreamingState aSctx) {
        return implJNI.FinishStream(SWIGTYPE_p_StreamingState.getCPtr(aSctx));
    }

    public static Metadata FinishStreamWithMetadata(SWIGTYPE_p_StreamingState aSctx, long aNumResults) {
        long cPtr = implJNI.FinishStreamWithMetadata(SWIGTYPE_p_StreamingState.getCPtr(aSctx), aNumResults);
        return cPtr == 0L ? null : new Metadata(cPtr, false);
    }

    public static void FreeStream(SWIGTYPE_p_StreamingState aSctx) {
        implJNI.FreeStream(SWIGTYPE_p_StreamingState.getCPtr(aSctx));
    }

    public static void FreeMetadata(Metadata m) {
        implJNI.FreeMetadata(Metadata.getCPtr(m), m);
    }

    public static void FreeString(String str) {
        implJNI.FreeString(str);
    }

    public static String Version() {
        return implJNI.Version();
    }

    public static String ErrorCodeToErrorMessage(int aErrorCode) {
        return implJNI.ErrorCodeToErrorMessage(aErrorCode);
    }
}

