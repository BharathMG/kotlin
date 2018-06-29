/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.daemon.common.experimental

import org.jetbrains.kotlin.daemon.common.ReplStateFacadeAsync
import org.jetbrains.kotlin.daemon.common.experimental.socketInfrastructure.Client

interface ReplStateFacadeClientSide: ReplStateFacadeAsync, Client<ReplStateFacadeServerSide>