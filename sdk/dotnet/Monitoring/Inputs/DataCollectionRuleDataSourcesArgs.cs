// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesArgs : Pulumi.ResourceArgs
    {
        [Input("extensions")]
        private InputList<Inputs.DataCollectionRuleDataSourcesExtensionArgs>? _extensions;

        /// <summary>
        /// One or more `extension` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DataCollectionRuleDataSourcesExtensionArgs> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<Inputs.DataCollectionRuleDataSourcesExtensionArgs>());
            set => _extensions = value;
        }

        [Input("performanceCounters")]
        private InputList<Inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs>? _performanceCounters;

        /// <summary>
        /// One or more `performance_counter` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs> PerformanceCounters
        {
            get => _performanceCounters ?? (_performanceCounters = new InputList<Inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs>());
            set => _performanceCounters = value;
        }

        [Input("syslogs")]
        private InputList<Inputs.DataCollectionRuleDataSourcesSyslogArgs>? _syslogs;

        /// <summary>
        /// One or more `syslog` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DataCollectionRuleDataSourcesSyslogArgs> Syslogs
        {
            get => _syslogs ?? (_syslogs = new InputList<Inputs.DataCollectionRuleDataSourcesSyslogArgs>());
            set => _syslogs = value;
        }

        [Input("windowsEventLogs")]
        private InputList<Inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs>? _windowsEventLogs;

        /// <summary>
        /// One or more `windows_event_log` blocks as defined below.
        /// </summary>
        public InputList<Inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs> WindowsEventLogs
        {
            get => _windowsEventLogs ?? (_windowsEventLogs = new InputList<Inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs>());
            set => _windowsEventLogs = value;
        }

        public DataCollectionRuleDataSourcesArgs()
        {
        }
    }
}