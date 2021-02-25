package ai.cyberlabs.yoonit.facefy.model

object FacefyOptions {

    var roi: ROI = ROI()

    var classification: Boolean = true

    var contours: Boolean = true

    var boundingBox: Boolean = true

    /**
     * * Limit the minimum face capture size.
     * This variable is the face detection box percentage in relation with the UI graphic view.
     * The value must be between 0 and 1.
     */
    var detectMinSize: Float = 0.0f

    /**
     * Limit the maximum face capture size.
     * This variable is the face detection box percentage in relation with the UI graphic view.
     * The value must be between 0 and 1.
     */
    var detectMaxSize: Float = 1.0f
}