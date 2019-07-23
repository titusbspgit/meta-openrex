# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on NXP 4.1.15-1.2.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "krogoth"
LOCALVERSION = "-fslc"

SRCREV = "9656d76816ba94753943b2a943479ac56804006d"
SRC_URI = "git://github.com/titusbspgit/openrex-linux-4.1.1.git;branch=${SRCBRANCH} \
           file://defconfig"

#PV .= "+git${SRCPV}"
COMPATIBLE_MACHINE = "(imx6q-openrex)"
