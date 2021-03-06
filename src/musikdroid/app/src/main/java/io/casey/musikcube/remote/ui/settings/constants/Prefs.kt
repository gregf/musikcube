package io.casey.musikcube.remote.ui.settings.constants

class Prefs {
    interface Key {
        companion object {
            val ADDRESS = "address"
            val MAIN_PORT = "port"
            val AUDIO_PORT = "http_port"
            val PASSWORD = "password"
            val LASTFM_ENABLED = "lastfm_enabled"
            val MESSAGE_COMPRESSION_ENABLED = "message_compression_enabled"
            val STREAMING_PLAYBACK = "streaming_playback"
            val SOFTWARE_VOLUME = "software_volume"
            val SSL_ENABLED = "ssl_enabled"
            val CERT_VALIDATION_DISABLED = "cert_validation_disabled"
            val TRANSCODER_BITRATE_INDEX = "transcoder_bitrate_index"
            val DISK_CACHE_SIZE_INDEX = "disk_cache_size_index"
            val UPDATE_DIALOG_SUPPRESSED_VERSION = "update_dialog_suppressed_version"
            val PLAYBACK_ENGINE_INDEX = "playback_engine_index"
        }
    }

    interface Default {
        companion object {
            val ADDRESS = "192.168.1.100"
            val MAIN_PORT = 7905
            val AUDIO_PORT = 7906
            val PASSWORD = ""
            val LASTFM_ENABLED = true
            val MESSAGE_COMPRESSION_ENABLED = true
            val STREAMING_PLAYBACK = false
            val SOFTWARE_VOLUME = false
            val SSL_ENABLED = false
            val CERT_VALIDATION_DISABLED = false
            val TRANSCODER_BITRATE_INDEX = 0
            val DISK_CACHE_SIZE_INDEX = 2
            val PLAYBACK_ENGINE_INDEX = 0
        }
    }

    companion object {
        val NAME = "prefs"
    }
}
