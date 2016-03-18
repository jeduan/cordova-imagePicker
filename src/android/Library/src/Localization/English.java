package com.synconset;

public class English extends Language {
  public English() {
    super("en");

    addMessage("PROCESS_IMAGES_TITLE", "Processing Images");
    addMessage("PROCESS_IMAGES_MESSAGE", "This may take a few moments");
    addMessage("MAXIMUM_PHOTOS", "Maximum %d Photos");
    addMessage("MAXIMUM_SELECT_PHOTOS", "You can only select %d photos at a time.");
    addMessage("OUT_OF_MEMORY", "Unable to load image into memory.");
    addMessage("UNABLE_TO_OPEN_IMAGE", "The image file could not be opened.");
  }
}
