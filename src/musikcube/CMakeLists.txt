set (CUBE_SRCS
	./Main.cpp
	./stdafx.cpp
	./app/layout/BrowseLayout.cpp
	./app/layout/ConsoleLayout.cpp
	./app/layout/SettingsLayout.cpp
	./app/layout/LibraryLayout.cpp
	./app/layout/MainLayout.cpp
	./app/layout/NowPlayingLayout.cpp
	./app/layout/SearchLayout.cpp
	./app/layout/TrackSearchLayout.cpp
	./app/model/DirectoryAdapter.cpp
	./app/overlay/ColorThemeOverlay.cpp
	./app/overlay/LocaleOverlay.cpp
	./app/overlay/PlaybackOverlays.cpp
	./app/overlay/PlayQueueOverlays.cpp
	./app/overlay/PluginOverlay.cpp
	./app/overlay/PreampOverlay.cpp
	./app/overlay/ServerOverlay.cpp
	./app/overlay/VisualizerOverlay.cpp
	./app/util/Hotkeys.cpp
	./app/util/GlobalHotkeys.cpp
	./app/util/PreferenceKeys.cpp
	./app/util/Playback.cpp
	./app/util/UpdateCheck.cpp
	./app/window/CategoryListView.cpp
	./app/window/LogWindow.cpp
	./app/window/TrackListView.cpp
	./app/window/TransportWindow.cpp
	./cursespp/App.cpp
	./cursespp/Checkbox.cpp
	./cursespp/Colors.cpp
	./cursespp/DialogOverlay.cpp
	./cursespp/InputOverlay.cpp
	./cursespp/LayoutBase.cpp
	./cursespp/ListOverlay.cpp
	./cursespp/ListWindow.cpp
	./cursespp/MultiLineEntry.cpp
	./cursespp/OverlayStack.cpp
	./cursespp/ShortcutsWindow.cpp
	./cursespp/Screen.cpp
	./cursespp/ScrollableWindow.cpp
	./cursespp/ScrollAdapterBase.cpp
	./cursespp/SimpleScrollAdapter.cpp
	./cursespp/SingleLineEntry.cpp
	./cursespp/Text.cpp
	./cursespp/TextInput.cpp
	./cursespp/TextLabel.cpp
	./cursespp/ToastOverlay.cpp
	./cursespp/Window.cpp
)

set(musikcube_INSTALL_DIR ${HOMEBREW_PREFIX})

if (NOT DEFINED musikcube_INSTALL_DIR)
	set(musikcube_INSTALL_DIR ${CMAKE_INSTALL_PREFIX})
endif()

configure_file("musikcube.in" "musikcube" @ONLY)

add_executable(musikcube ${CUBE_SRCS})

add_definitions(-DNCURSES_WIDECHAR)

if (CMAKE_SYSTEM_NAME MATCHES "Linux" OR CMAKE_SYSTEM_NAME MATCHES "FreeBSD")
	target_link_libraries(musikcube ${musikcube_LINK_LIBS} ncursesw panelw musikcore musikglue)
else()
	target_link_libraries(musikcube ${musikcube_LINK_LIBS} curses panel musikcore musikglue)
endif()
