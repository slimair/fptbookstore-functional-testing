FROM katalonstudio/katalon
ADD . /tmp/project

CMD katalonc.sh -projectPath=/tmp/project/fptbookstore_katalon.prj -browserType="Firefox" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/FptBook_TestSuite" -apiKey=ba490008-3999-4890-848b-b43048e5ca92 --config -webui.autoUpdateDrivers=true --allowed-ips="137.184.131.91" --disable-dev-shm-usage  --no-sandbox