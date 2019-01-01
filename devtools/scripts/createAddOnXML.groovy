// @ExecutionModes({on_single_node="main_menu_scripting/devtools[addons.createAddOnXML]"})

import org.freeplane.plugin.script.proxy.Proxy

Proxy.Node nodeRoot = node.map.root
nodeRoot['createAddOnXML'] = "true"
evaluate(new File("scripts/installScriptAddOn.groovy"))
nodeRoot['createAddOnXML'] = null