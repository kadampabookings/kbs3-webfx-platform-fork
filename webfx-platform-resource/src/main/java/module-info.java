// File managed by WebFX (DO NOT EDIT MANUALLY)

/**
 * Cross-platform API for accessing resources files  (see {@link dev.webfx.platform.resource.Resource Resource})
 */
module webfx.platform.resource {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.util;

    // Exported packages
    exports dev.webfx.platform.resource;
    exports dev.webfx.platform.resource.spi;

    // Used services
    uses dev.webfx.platform.resource.spi.ResourceProvider;

}