package com.synconset;

public class Danish extends Language {
  public Danish() {
    super("da");

    addMessage("PROCESS_IMAGES_TITLE", "Indlæser billeder");
    addMessage("PROCESS_IMAGES_MESSAGE", "Dette tager måske lidt tid");
    addMessage("MAXIMUM_PHOTOS", "Maximum %d billeder");
    addMessage("MAXIMUM_SELECT_PHOTOS", "Du kan kun vælge %d billeder ad gangen.");
    addMessage("OUT_OF_MEMORY", "Kunne ikke indlæse billedet i hukommelsen");
    addMessage("UNABLE_TO_OPEN_IMAGE", "Kunne ikke åbne billedet.");
  }
}
