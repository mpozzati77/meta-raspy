require recipes-core/images/rpi-basic-image.bb

DESCRIPTION = "Raspy pi image"
LICENSE = "CLOSED"

# network and services
#IMAGE_INSTALL_append = " vsftpd"

# network and services
IMAGE_FEATURES_append = " ssh-server-openssh"
IMAGE_INSTALL_append = " bash"

# Start scripts and services
#IMAGE_INSTALL_append = " ntpservice"

