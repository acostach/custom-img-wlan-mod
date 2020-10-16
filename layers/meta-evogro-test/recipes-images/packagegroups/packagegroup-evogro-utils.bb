DESCRIPTION = "Basic Utils for Evogro Images"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    bash \
    e2fsprogs \
    file \
    findutils \
    grep \
    sed \
    sudo \
    openssh \
    openssh-sftp-server \
    tzdata \
    curl \
    util-linux-mountpoint \
    util-linux-hwclock \
    iw \
    hostapd \
    dnsmasq \
    iptables \
    networkmanager \
"

# We already have
# CONFIG_USB_ACM=m
# CONFIG_USB_VIDEO_CLASS=m
# CONFIG_USB_VIDEO_CLASS_INPUT_EVDEV=y
# CONFIG_NETFILTER_XTABLES=y
# CONFIG_NETFILTER_XT_TARGET_REDIRECT=m
