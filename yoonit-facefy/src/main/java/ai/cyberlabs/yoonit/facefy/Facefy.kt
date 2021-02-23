package ai.cyberlabs.yoonit.facefy

import ai.cyberlabs.yoonit.facefy.model.DetectedFace
import ai.cyberlabs.yoonit.facefy.model.FacefyOptions
import com.google.mlkit.vision.common.InputImage

class Facefy {

    private val facefyController = FacefyController()

    var classification: Boolean = FacefyOptions.classification
        set(value) {
            FacefyOptions.classification = value
            field = value
        }

    var contours: Boolean = FacefyOptions.contours
        set(value) {
            FacefyOptions.contours = value
            field = value
        }

    var boundingBox: Boolean = FacefyOptions.boundingBox
        set(value) {
            FacefyOptions.boundingBox = value
            field = value
        }

    fun detect(image: InputImage, onFaceDetected: (DetectedFace) -> Unit) = facefyController.detect(image, onFaceDetected)
}