# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc

inherit fsl-u-boot-localversion

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7|vf|imx6q-openrex|imx6s-openrex)"

PROVIDES += "u-boot"

PV = "v2016.07+git${SRCPV}"

SRCBRANCH ??= "krogoth"

SRC_URI = "git://github.com/titusbspgit/openrex-uboot-v2016.07.git;branch=${SRCBRANCH}"
SRCREV = "43c8f63c91269342c74c641b8c3e3b5c5b81717b"

S = "${WORKDIR}/git"

# FIXME: Allow linking of 'tools' binaries with native libraries
#        used for generating the boot logo and other tools used
#        during the build process.
EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="${BUILD_LDFLAGS}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
